#!/usr/bin/env groovy
def call() {
    echo "Building the App..."
     // Specify the full path to the requirements.txt file in the other project
    def requirementsFilePath = '/home/rym/eau2c2/eau2c2/app/requirements.txt'

    sh "pip install jupyter nbconvert"
    sh "pip install -r ${requirementsFilePath}"
    // sh "python -u eau2c2_dashcore.py"
}
