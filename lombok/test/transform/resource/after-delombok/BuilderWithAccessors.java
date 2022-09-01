class BuilderWithAccessors {
	private final int plower;
	private final int pUpper;
	private int _foo;
	private int __bar;
	@java.lang.SuppressWarnings("all")
	BuilderWithAccessors(final int plower, final int upper, final int foo, final int _bar) {
		this.plower = plower;
		this.pUpper = upper;
		this._foo = foo;
		this.__bar = _bar;
	}
	@java.lang.SuppressWarnings("all")
	public static class BuilderWithAccessorsBuilder {
		@java.lang.SuppressWarnings("all")
		private int plower;
		@java.lang.SuppressWarnings("all")
		private int upper;
		@java.lang.SuppressWarnings("all")
		private int foo;
		@java.lang.SuppressWarnings("all")
		private int _bar;
		@java.lang.SuppressWarnings("all")
		BuilderWithAccessorsBuilder() {
		}
		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public BuilderWithAccessors.BuilderWithAccessorsBuilder plower(final int plower) {
			this.plower = plower;
			return this;
		}
		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public BuilderWithAccessors.BuilderWithAccessorsBuilder upper(final int upper) {
			this.upper = upper;
			return this;
		}
		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public BuilderWithAccessors.BuilderWithAccessorsBuilder foo(final int foo) {
			this.foo = foo;
			return this;
		}
		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public BuilderWithAccessors.BuilderWithAccessorsBuilder _bar(final int _bar) {
			this._bar = _bar;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithAccessors build() {
			return new BuilderWithAccessors(this.plower, this.upper, this.foo, this._bar);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "BuilderWithAccessors.BuilderWithAccessorsBuilder(plower=" + this.plower + ", upper=" + this.upper + ", foo=" + this.foo + ", _bar=" + this._bar + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	public static BuilderWithAccessors.BuilderWithAccessorsBuilder builder() {
		return new BuilderWithAccessors.BuilderWithAccessorsBuilder();
	}
}
