pipeline {
  agent any

  tools {
    // Nombre dado a la instalación de Maven en "Tools configuration"
    maven "maven default"
  }

  stages {
    stage('Git fetch') { 
      steps {
        // Get some code from a GitHub repository
        git 'https://github.com/arg313/JUnit-Hmis.git'
      }
    }
    stage('Compile, Test, Package') { 
      steps {
        // When necessary, use '-f path-to/pom.xml' to give the path to pom.xml
        // Run goal 'package'. It includes compile, test and package.
        sh "mvn  -f Sesion05arg313/pom.xml clean package" 
      }
      post { 
        // Record the test results and archive the jar file.
        success {
          junit '**/target/surefire-reports/TEST-*.xml'
          archiveArtifacts '**/target/*.jar'
          jacoco( 
            execPattern: '**/target/jacoco.exec',
            classPattern: '**/target/classes',
            sourcePattern: '**/src/',
            exclusionPattern: '**/test/'
            )
         publishCoverage adapters: [jacocoAdapter('**/target/site/jacoco/jacoco.xml')] 
        }
      }
    }
    stage ('Analysis') {
        steps {
	        // Warnings next generation plugin required
	        sh "mvn -f Sesion05arg313/pom.xml site"
        }
        post {
            success {
                dependencyCheckPublisher pattern: '**/target/site/dependency-check-report.xml'
                recordIssues enabledForFailure: true, tool: checkStyle()
                recordIssues enabledForFailure: true, tool: pmdParser()
                recordIssues enabledForFailure: true, tool: cpd()
                recordIssues enabledForFailure: true, tool: findBugs()
                recordIssues enabledForFailure: true, tool: spotBugs()
            }  
        }
    }
    stage ('Documentation') {
        steps {
	        sh "mvn -f Sesion05arg313/pom.xml javadoc:javadoc javadoc:aggregate"
        }
        post{
            success {
                step $class: 'JavadocArchiver', javadocDir: 'Sesion05arg313/target/site/apidocs', keepAll: false
                publishHTML(target: [reportName: 'Maven Site', reportDir: 'Sesion05arg313/target/site', reportFiles: 'index.html', keepAll: false])
            }
        }
    }
    stage('SonarQube analysis') {
   	steps {
     		withSonarQubeEnv(credentialsId: 'sonar_server', installationName: 'sonarqube_scanner') {
       			sh 'mvn -f Sesion05arg313/pom.xml sonar:sonar'
    		}
   	}
    }
  }
}
