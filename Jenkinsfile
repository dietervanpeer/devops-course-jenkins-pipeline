node {
    stage('Compile') {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], userRemoteConfigs: [[credentialsId: '5c05a213-e250-4cfe-8980-6f2ceeed88ec', url: 'https://github.com/dietervanpeer/devops-course-jenkins-pipeline.git']]])
        sh './gradlew compile'
    }

    stage('Test') {
        sh './gradlew test'
        step([$class: "JUnitResultArchiver", testResults: "**/build/test-results/**/TEST-*.xml"])
    }
}
