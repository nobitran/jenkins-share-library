#!/usr/bin/env groovy

import com.helper.Docker

def call(String imageName, String version, String creId) {
	return new Docker(this).build(imageName, version, creId)
}