import org.kohsuke.github.GitHubBuilder

class GitManager {

    GitHubBuilder builder


    GitManager(String repoUrl) {
        builder = new GitHubBuilder()
    }

}
