import kotlin.test.*

class FincraftTest {
    @Test
    fun testFakePmt(){
        assertEquals(10, FincraftFactory.createFincraft().fakePmt(120, 12))
    }
}