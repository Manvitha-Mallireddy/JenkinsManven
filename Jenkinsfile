pipeline
{
  agent any
  stages
  {
    stage("Build")
    {
      steps
      {
        echo "Build stage"
        bat "mvn clean"
      }
    }
    stage("Compile")
    {
      steps
      {
        echo "Compile stage"
        bat "mvn compile"
      }
    }
    stage("Test")
    {
      steps
      {
        echo "Test stage"
        bat "mvn test"
      }
    }
    stage("Deploy")
    {
      steps
      {
        echo "Deploy stage"
      }
    }
  }
}
