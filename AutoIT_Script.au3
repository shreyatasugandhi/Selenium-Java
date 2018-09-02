
WinWait("[CLASS:#32770]","",10)

ControlFocus("File Upload", "", "Edit1")
Sleep(1000)

ControlSetText("File Upload", "", "Edit1", "D:\Work\Freelance\Trainings\Selenium\Selenium_Java\AdvanceSelenium\SampleForAutoIT.txt")

Sleep(1000)
ControlClick("File Upload", "", "Button1")
Sleep(1000)

