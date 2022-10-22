#!/usr/bin/env groovy

package com.helper

class Version implements Serializable {
	Version() {

	}

	// type
	def VERSION_MAJOR = "major"
	def VERSION_MINOR = "minor"
	def VERSION_PATCH = "patch"

	def increaseVersion(String version, String type=VERSION_MINOR) {
		def (major, minor, patch) = version.split('\\.')

		switch (type) {
			case VERSION_MAJOR:
				major++
				break
			case VERSION_MINOR:
				minor++
				break
			case VERSION_PATCH:
				patch++
				break
		}

		return [major, minor, patch].join('.')
	}
}
