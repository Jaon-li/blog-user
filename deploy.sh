mvn clean package
scp target/blog-user-0.0.1-SNAPSHOT.jar tx:/data/server/blog/user
ssh tx "cd /data/server/blog/user;source /etc/profile;sh start.sh"

