import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TestClassTest {
    private val validator = TestClass(5)

    @Test
    fun test_valid() {
        assertEquals(5, validator.getInitial())
    }
}