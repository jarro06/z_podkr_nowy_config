 
listView('z_podkr_nowy Jobs') {
    description('z_podkr_nowy Jobs')
    jobs {
        regex('z_podkr_nowy_.+')
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
