user registration happened

I am commiting and pushing before pulling the latest which has made by sangram1423 user.
check wether we will get error or not.



I am fixed the BUG-122 and commited and pushed to remote repo because of more priority.

Now we can do "git stash apply" to continue our work with BUG-121
I am working on BUG-121 which is patially completed and my manager gave me another work BUG-122 which is having more priority, need to complete the BUG-122 before BUG-121.

In that case we need to use the "git stash" 

before starting the BUG-122 use git stash command, so that it will be stored in a temporary or back up file.

start working on BUG-122 and commit and push changes to remote repo.

again do "git stash apply" to get your old BUG-121 code to continue work on remaining work to complete.

Note: we shold not remove the old code and we should not push the BUG-121 code to remote repo to work with BUG-122 priority wise.


Here conflict came because of the same file modification which we have stored temporarily in git stash.

So we need to fix the conflict and merge the code and work with remaining work and commit and push for BUG-121.
