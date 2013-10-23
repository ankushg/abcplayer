# Instructions to use the GitHub repo
Add a remote repository:

    git remote add github git@github.com:ankushg/abcplayer.git

Push to GitHub manually via:

    git push github

Automatically push to GitHub upon pushing to the 6.005 repo by creating a `.git/hooks/post-receive` file with the contents:

    git push github