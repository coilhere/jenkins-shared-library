#!/usr/bin/env groovy
def call(){
    echo"Building the App..."
    sh "run pip install jupyter nbconvert"
    sh"run pip install -r requirements.txt"
    sh" python -u eau2c2_dashcore.py"

}
