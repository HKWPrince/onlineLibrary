echo "Stopping Backend Spring Boot Application..."
# 找到運行 Spring Boot 應用的進程，並將其殺死
BACKEND_PID=$(ps -ef | grep 'gradlew bootRun' | grep -v grep | awk '{print $2}')
if [ ! -z "$BACKEND_PID" ]; then
    kill -9 $BACKEND_PID
    echo "Backend Spring Boot application stopped."
else
    echo "Backend Spring Boot application not found."
fi

