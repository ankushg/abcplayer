# Instructions for the GitHub Repo
## Setting up GitHub Remote
Add a remote repository:

    git remote add github git@github.com:ankushg/abcplayer.git

Push to GitHub manually via:

    git push github

## Pushing to GitHub and 6.005 Repos Simultaneously
Automatically push to GitHub and the official 6.005 repo at the same time by doing the following (replace `<kerberos>` in the first line with your actual kerberos):

    git config --add remote.all.url ssh://<kerberos>@athena.dialup.mit.edu/afs/athena.mit.edu/course/6/6.005/git/fa13/projects/abcplayer/anandoza-ankush-hkannan.git
    git config --add remote.all.url git@github.com:ankushg/abcplayer.git

You can now do `git push all` to push to both 6.005 and GitHub (but will require your password still for pushing to 6.005).