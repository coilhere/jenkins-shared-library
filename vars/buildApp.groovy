#!/usr/bin/env groovy
def call() {
   dir('app') {
        echo "Current directory: ${PWD}"
        echo "Contents of the directory:"
        sh "ls -la"

        // Specify the path relative to Jenkins workspace
        def requirementsFilePath = "${PWD}requirements.txt"

        sh "pip install jupyter nbconvert"
        sh "pip install -r requirements.txt"
        // sh "python -u eau2c2_dashcore.py"
    }
}
