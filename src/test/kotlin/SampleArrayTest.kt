package com.example.approval

import org.approvaltests.Approvals
import org.junit.jupiter.api.Test
import java.util.*


class SampleArrayTest {
    @Test
    fun testList() {
        val names = arrayOf("Llewellyn", "James", "Dan", "Jason", "Katrina")
        Arrays.sort(names)
        Approvals.verifyAll("", names)
    }
}