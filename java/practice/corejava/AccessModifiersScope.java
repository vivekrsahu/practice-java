package practice.corejava;

/**
 * This class aims at providing a basic knowledge on the possible scopes of all the access modifiers.
 * @author Vivek Ranjan Sahu
 */
public final class AccessModifiersScope {
	// valid inner classes
	public class InnerPublic {}
	protected class InnerProtected {}
	class Inner {}
	@SuppressWarnings("unused")
	private class InnerPrivate {}
	static class InnerStatic {}
	final class InnerFinal {}
	strictfp class InnerStrictfp {}

	// invalid inner classes
	//default class InnerDefault {} and all others

	// valid inner interfaces
	public interface InnerIPublic {}
	protected interface InnerIProtected {}
	interface InnerI {}
	@SuppressWarnings("unused")
	private interface InnerIPrivate {}
	strictfp interface InnerIStrictfp {}
	abstract interface InnerIAbstract {}

	// invalid inner interfaces
	//default interface InnerIDefault {} and all others

	// only allowed inside Interfaces
//	default void methodDefault() {}
	interface SomeInterface {
		default void methodDefault() {}
	}
}

// valid outer class modifiers
class Outer {} // scope is default but if we use "default" modifier, then compilation error
//public class OuterPublic {} // valid but one file should contain only one public
final class OuterFinal {}
abstract class OuterAbstract {}
strictfp class OuterStrictfp {}

// invalid outer class modifiers
//default class OuterDefault {}
//private class OuterPrivate {}
//protected class OuterProtected {}
//static class OuterStatic {} and all others

// valid outer interfaces
interface OuterI {} // implicitly default
//public interface OuterIPublic {} // valid but one file should contain only one public
abstract interface OuterIAbstract {}
strictfp interface OuterIStrictfp {}

// invalid outer interfaces
//default interface OuterIDefault {}
//private interface OuterIPrivate {}
//protected interface OuterIProtected {}
//final interface OuterIFinal {}
//static interface OuterIStatic {} and all others

// valid outer enums
enum OuterE {} // implicitly final
//public enum OuterEPublic {} // valid but one file should contain only one public
strictfp enum OuterEStrictfp {}

// invalid outer enums
//final enum OuterEFinal {}
//default enum OuterEDefault {}
//private enum OuterEPrivate {}
//protected enum OuterEProtected {}
//static enum OuterEStatic {} and all others