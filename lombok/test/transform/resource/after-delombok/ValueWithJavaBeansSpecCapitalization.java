final class ValueWithJavaBeansSpecCapitalization {
	private final int aField;
	@java.lang.SuppressWarnings("all")
	public ValueWithJavaBeansSpecCapitalization(final int aField) {
		this.aField = aField;
	}
	@java.lang.SuppressWarnings("all")
	public int getaField() {
		return this.aField;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof ValueWithJavaBeansSpecCapitalization)) return false;
		final ValueWithJavaBeansSpecCapitalization other = (ValueWithJavaBeansSpecCapitalization) o;
		if (this.getaField() != other.getaField()) return false;
		return true;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + this.getaField();
		return result;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public java.lang.String toString() {
		return "ValueWithJavaBeansSpecCapitalization(aField=" + this.getaField() + ")";
	}
}