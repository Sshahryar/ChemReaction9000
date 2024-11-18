@echo off
set PATH_TO_FX=C:/Users/hussa/Downloads/openjfx17/javafx-sdk-17.0.13/lib
set PATH_TO_FX_BIN=C:/Users/hussa/Downloads/openjfx17/javafx-sdk-17.0.13/bin
set JAVA_OPTS=-Dprism.forceGPU=false -Dprism.order=sw -Dprism.verbose=true -Djava.library.path=%PATH_TO_FX_BIN%
javac --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml -d . BalancingEnter.java
java %JAVA_OPTS% --module-path %PATH_TO_FX% --add-modules javafx.controls,javafx.fxml -cp . BalancingEnter

