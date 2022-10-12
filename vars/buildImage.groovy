#!/usr/bin/env groovy

def call(String imageName, String creId) {
    echo "Building app ... with $BRANCH_NAME";
    withCredentials([
        usernamePassword(
                credentialsId: creId,
                usernameVariable: 'USERNAME',
                passwordVariable: 'PASSWORD'
        )
    ]) {
        sh "docker build -t $imageName ."
        sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
        sh "docker push $imageName"
    }
}