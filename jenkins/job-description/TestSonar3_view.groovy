 
listView('TestSonar3 Jobs') {
    description('TestSonar3 Jobs')
    jobs {
        regex('TestSonar3_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
