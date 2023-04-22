def call()
{
    def command = "git rev-parse HEAD".execute()
    def result = command.text.trim()
    return result
}
