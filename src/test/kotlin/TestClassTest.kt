import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TestClassTest {


    private val mockInterface = mockk<TestInterface>()
    private val validator = TestClass(5)

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun test_valid() = runTest {

        every { mockInterface.hello() } returns "nothing"

        assertEquals("nothing", mockInterface.hello())
    }
}