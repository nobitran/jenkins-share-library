#!/usr/bin/env groovy

def call(String imageName) {
    echo "Building app ... with $BRANCH_NAME";
    withCredentials([
        usernamePassword(
                credentialsId: 'dockerhub',
                usernameVariable: 'USERNAME',
                passwordVariable: 'PASSWORD'
        )
    ]) {
        sh "docker build -t $imageName ."
        sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
        sh "docker push $imageName"
    }
}