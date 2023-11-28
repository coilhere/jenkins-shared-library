#!/usr/bin/env groovy
def call() {
                echo 'Building the App...'

                // Create a virtual environment
                sh 'python -m venv venv'

                // Activate the virtual environment
                sh 'source venv/bin/activate'

                // Install required packages within the virtual environment
                sh 'pip install jupyter nbconvert'
                sh 'pip install -r requirements.txt'

                // Deactivate the virtual environment
                sh 'deactivate'

                // Run your other commands (if any) outside the virtual environment
                // sh 'python -u eau2c2_dashcore.py'
    // sh "python -u eau2c2_dashcore.py"
}
