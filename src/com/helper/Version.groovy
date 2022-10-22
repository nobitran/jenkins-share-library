package com.helper;

class Test {

    // type
    final VERSION_MAJOR = "major"
    final VERSION_MINOR = "minor"
    final VERSION_PATCH = "patch"

    def increaseVersion(String version, String type) {
        def (major, minor, patch) = version.split('\\.')

        switch (type) {
            case VERSION_MAJOR:
                major++
                break;
            case VERSION_MINOR:
                minor++
                break;
            case VERSION_PATCH:
                patch++
                break;
        }

        return [major,minor,patch].join('.')
    }
}
