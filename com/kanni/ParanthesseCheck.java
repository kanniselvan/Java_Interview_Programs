package com.kanni;

import java.util.Stack;

public class ParanthesseCheck {

	public static void main(String[] args) {

		String val = "{{[[(())]]}";

		System.out.println(isCheckValid(val.toCharArray()));
	}

	public static boolean isCheckValid(char[] value) {

		if (null != value && value.length > 0) {

			Stack<Character> st = new Stack<>();

			for (int i = 0; i < value.length; i++) {

				if (value[i] == '[' || value[i] == '{' || value[i] == '(') {
					st.push(value[i]);
				} else {

					if(st.isEmpty())
						return false;
					
					Character character = st.peek(); //fetch value from stack

					if (value[i] == ']' && character == '[')
						st.pop();
					if (value[i] == '}' && character == '{')
						st.pop();
					if (value[i] == ')' && character == '(')
						st.pop();

				}
			}
			if (st.isEmpty())
				return true;
		}
		return false;
	}
}
