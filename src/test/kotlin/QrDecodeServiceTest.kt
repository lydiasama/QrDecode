import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class QrDecodeServiceTest {
    private var decaodeService = QrDecodeService()
    private val qr = "000201010211041665455444433331135204123453037645802TH5916WANYAN ICE CREAM6007BANGKOK6304936A"
    @Before
    fun setUp() {

    }

    @Test
    fun testSumCheck() {
        val qrTestSumCheck = "000201010211041665455444433331135204123453037645802TH5916WANYAN ICE CREAM6007BANGKOK6304"
        val sum = decaodeService.getChecksum(qrTestSumCheck)

        assertEquals("936A", sum)
    }
}