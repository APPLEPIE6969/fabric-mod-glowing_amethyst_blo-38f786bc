@rem Gradle wrapper script for Windows
@if "%DEBUG%"=="" @echo off
setlocal
set DIRNAME=%~dp0
set JAVA_EXE=java.exe
if defined JAVA_HOME set JAVA_EXE=%JAVA_HOME%/bin/java.exe
"%JAVA_EXE%" -jar "%DIRNAME%gradle/wrapper/gradle-wrapper.jar" %*
