def gitDownload (repo)
{
    git "https://github.com/ravicharan2000/${repo}.git"
}

def buildArtifact()
{
    sh'mvn package'
}
