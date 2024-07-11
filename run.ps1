# Define the commands
$compile = "javac -d bin .\src\App.java"
$run = "java -cp bin App"

# Execute the commands
Invoke-Expression $compile
Invoke-Expression $run