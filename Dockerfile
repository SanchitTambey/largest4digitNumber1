FROM openjdk:17-jdk-slim
WORKDIR /app
COPY LargestFourDigitNumber.java .
RUN javac LargestFourDigitNumber.java
CMD ["java", "LargestFourDigitNumber"]
