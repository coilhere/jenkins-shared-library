#!/usr/bin/env groovy
def call() {
   echo "Building the App..."
    echo "Current directory: ${PWD}"
    echo "Contents of the directory:"
    sh "ls -la"
    echo "Requirements file path: ${requirementsFilePath}"

    sh "pip install jupyter nbconvert"
    sh "pip install -r ${requirementsFilePath}"
    // sh "python -u eau2c2_dashcore.py"
}
