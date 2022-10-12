#!/usr/bin/env groovy

import com.helper.Docker

def call(String imageName, String creId) {
	return new Docker(this).build(imageName, creId)
}