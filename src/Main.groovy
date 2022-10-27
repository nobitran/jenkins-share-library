
import com.helper.Version

static void main(String[] args) {
  def version = '9.1.1'

  def test = new Version()
  def new_version = test.increaseVersion(version, test.VERSION_MAJOR)
  print(new_version)
}