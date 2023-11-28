#!/usr/bin/env groovy
def call(){
    echo"Building the App..."
    sh "RUN pip install jupyter nbconvert"
    sh"RUN pip install -r requirements.txt"
    sh" python -u eau2c2_dashcore.py"

}
