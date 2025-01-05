def gitDownload (repo)
{
    git "https://github.com/ravicharan2000/${repo}.git"
}

def buildArtifact()
{
    sh'mvn package'
}

def tomcatDeploy(ip,context)
{
    sh "scp ${env.WORKSPACE}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}

def executeSelenium()
{
    sh "java -jar ${env.WORKSPACE}/testing.jar"
}
