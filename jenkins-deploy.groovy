def WORKSPACE = pwd()

node {
    stage('Git Pull') {
        sh ("""
            cd $WORKSPACE
            git clone https://github.com/charanvattikonda/scripts
        """)
    }

    stage('Script stage') {
        sh ("""
            cd scripts 
            sh -x jenkins-tester.sh                           
        """)
    }
}