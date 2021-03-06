package zielu.gittoolbox.fetch;

import com.intellij.openapi.progress.DumbProgressIndicator;
import com.intellij.openapi.project.Project;
import git4idea.repo.GitRepository;
import git4idea.update.GitFetchResult;
import git4idea.update.GitFetcher;
import org.jetbrains.annotations.NotNull;

public class DefaultGtFetchClient implements GtFetchClient {
  private final GitFetcher fetcher;

  public DefaultGtFetchClient(@NotNull Project project, boolean fetchAll) {
    fetcher = new GitFetcher(project, DumbProgressIndicator.INSTANCE, fetchAll);
  }

  @Override
  public GitFetchResult fetch(@NotNull GitRepository repository) {
    return fetcher.fetch(repository);
  }
}
