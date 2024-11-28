FROM quay.io/wildfly/wildfly:33.0.2.Final-jdk17
RUN /opt/jboss/wildfly/bin/add-user.sh admin admin --silent
COPY build/libs/device-history.war /opt/jboss/wildfly/standalone/deployments/
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "-c", "standalone-full.xml"]
