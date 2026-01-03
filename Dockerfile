FROM tomcat:9.0.100-jre21-temurin-jammy
COPY target/maven-web-app*.war /usr/local/tomcat/webapps/maven-web-application.war
WelCome
CMD "cat /etc/profile"
