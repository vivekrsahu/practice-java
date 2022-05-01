# Steps to push project from local to github
1. Create repository in github and don't select "ADD a README file" checkbox.
2. Create project in IDE with same name.
3. Go to the project folder in cmd and open git bash.
4. Execute below commands:
       a. git init
       b. git commt -m "commit comment"
       c. git branch -M main
       d. git remote add origin git@github.com:vivekrsahu/practice-springboot.git
       e. git push -u origin main
