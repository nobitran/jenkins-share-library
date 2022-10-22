#!/usr/bin/env groovy

import com.helper.Version

static def call(String version, String type) {
	return new Version().increaseVersion(version, type)
}