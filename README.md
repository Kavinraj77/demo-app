# Jenkins Freestyle Automation Pipeline

## Overview
This project demonstrates a complete CI/CD pipeline using Jenkins, GitHub, and Maven.

## Prerequisites
- Java 11+
- Maven 3.8.1+
- Git 2.30+
- Jenkins 2.387+
- GitHub Account

## Installation Steps

### 1. Install Java
\`\`\`bash
sudo apt install openjdk-11-jdk -y
java -version
\`\`\`

### 2. Install Maven
\`\`\`bash
sudo apt install maven -y
mvn -version
\`\`\`

### 3. Install Jenkins
\`\`\`bash
wget -q -O - https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add -
sudo sh -c 'echo deb https://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
sudo apt-get update
sudo apt-get install jenkins -y
sudo systemctl start jenkins
\`\`\`

### 4. Configure Jenkins
- Access http://localhost:8080
- Unlock with initial password: \`sudo cat /var/lib/jenkins/secrets/initialAdminPassword\`
- Install suggested plugins
- Create admin user
- Install: Git, GitHub, Maven Integration, HTML Publisher plugins

### 5. Create GitHub Personal Access Token
- Go to GitHub Settings → Developer settings → Personal access tokens
- Generate new token with \`repo\` and \`admin:repo_hook\` scopes
- Copy token

### 6. Create Jenkins Freestyle Job
- New Item → Demo-App-Build → Freestyle job
- Configure SCM with your repository URL
- Add GitHub credentials
- Add build triggers
- Add build steps (compile, test, package)
- Configure post-build actions

## Building Locally

\`\`\`bash
# Clone repository
git clone https://github.com/YOUR_USERNAME/demo-app.git
cd demo-app

# Clean build
mvn clean compile

# Run tests
mvn test

# Package
mvn package

# Run application
java -jar target/demo-web-app-1.0.0.jar
\`\`\`

## Project Structure

\`\`\`
demo-app/
├── src/
│   ├── main/java/com/demo/app/
│   │   ├── Calculator.java
│   │   └── Main.java
│   └── test/java/com/demo/app/
│       └── CalculatorTest.java
├── pom.xml
├── index.html
├── style.css
└── README.md
\`\`\`

## Jenkins Pipeline Stages

1. **Checkout**: Clone code from GitHub
2. **Compile**: Compile Java source code
3. **Test**: Run unit tests
4. **Package**: Create JAR file
5. **Report**: Generate HTML reports
6. **Archive**: Store artifacts

## Troubleshooting

### Build Fails at Checkout
- Verify GitHub credentials are correct
- Check GitHub URL is accessible
- Ensure network connectivity

### Maven Build Fails
- Check Java version: \`java -version\`
- Clear Maven cache: \`rm -rf ~/.m2/repository\`
- Run: \`mvn clean install\`

### Tests Fail
- Review console output
- Check test code for errors
- Verify test dependencies in pom.xml

## Contributing
1. Create a new branch
2. Make changes
3. Commit: \`git commit -m "Description"\`
4. Push: \`git push origin branch-name\`
5. Create Pull Request

## Team
Team 8 - Jenkins Freestyle Automation Pipeline Project

## License
MIT License