import kotlin.test.*

class FincraftTest {
    @Test
    fun testFakePmt(){
        assertEquals(10, FincraftFactory.createFincraft().fakePmt(120, 12))
    }
    @Test
    fun testPmt(){
        assertEquals(expected = 10014.444932844934, actual = FincraftFactory.createFincraft().pmt(10012.0, 12.0, 12))
    }
}