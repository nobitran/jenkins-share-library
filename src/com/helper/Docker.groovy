#!/usr/bin/env groovy

package com.helper

class Docker implements Serializable {
	def script
	Docker(script) {
		this.script = script
	}

	def build(String imageName, String creId) {
		script.echo "Building app ... with $script.BRANCH_NAME"
		script.withCredentials([
			script.usernamePassword(
				credentialsId: creId,
				usernameVariable: 'USERNAME',
				passwordVariable: 'PASSWORD'
			)
		]) {
			script.sh "docker build -t $imageName ."
			script.sh 'echo $script.PASSWORD | docker login -u $script.USERNAME --password-stdin'
			script.sh "docker push $imageName"
			script.echo "Pushed image to dockerhub"
		}
	}
}
