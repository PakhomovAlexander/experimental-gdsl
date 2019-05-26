package SCENARIO

transform {
    it.main {
        age = age + 1
    }

    trigger 'TR_DUE_CRM_BCM' of {
        print age
        print CODE
        print NAME
        print SURNAME
        print ADDRESS
        print age
        print BIRTHDAY
    }
}
