#!/usr/bin/env groovy
def call() {
   dir('app') {
        echo "Current directory: ${PWD}"
        echo "Contents of the directory:"
        sh "ls -la"

        // Specify the path relative to Jenkins workspace
        def requirementsFilePath = "${PWD}home/rym/eau2c2/eau2c2/app/requirements.txt"

        sh "pip install jupyter nbconvert"
        sh "pip install -r ${requirementsFilePath}"
        // sh "python -u eau2c2_dashcore.py"
    }
}
