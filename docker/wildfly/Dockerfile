FROM quay.io/wildfly/wildfly:33.0.2.Final-jdk17

RUN /opt/jboss/wildfly/bin/add-user.sh admin admin --silent
WORKDIR /opt/jboss/wildfly/standalone

COPY docker/wildfly/standalone-full.xml ./configuration/
COPY ../../build/libs/device-history.war docker/wildfly/postgresql-42.7.3.jar ./deployments/

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "-c", "standalone-full.xml"]
