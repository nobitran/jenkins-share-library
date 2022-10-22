
import com.helper.Version

static void main(String[] args) {
  def version = '1.1.1'

  def test = new Version()
  def new_version = test.increaseVersion(version, test.VERSION_PATCH)
  print(new_version)
}