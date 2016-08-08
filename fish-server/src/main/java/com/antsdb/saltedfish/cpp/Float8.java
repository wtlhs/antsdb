/*-------------------------------------------------------------------------------------------------
 _______ __   _ _______ _______ ______  ______
 |_____| | \  |    |    |______ |     \ |_____]
 |     | |  \_|    |    ______| |_____/ |_____]

 Copyright (c) 2016, antsdb.com and/or its affiliates. All rights reserved. *-xguo0<@

 This program is free software: you can redistribute it and/or modify it under the terms of the
 GNU Affero General Public License, version 3, as published by the Free Software Foundation.

 You should have received a copy of the GNU Affero General Public License along with this program.
 If not, see <https://www.gnu.org/licenses/agpl-3.0.txt>
-------------------------------------------------------------------------------------------------*/
package com.antsdb.saltedfish.cpp;

public class Float8 {
	public static final long allocSet(Heap heap, double value) {
		long address = heap.alloc(9);
		set(address, value);
		return address;
	}

	public static final void set(long address, double value) {
		Unsafe.putByte(address, Value.FORMAT_FLOAT8);
		Unsafe.putDouble(address + 1, value);
	}

	public static final double get(Heap heap, long address) {
		double n = Unsafe.getDouble(address + 1);
		return n;
	}

	public static long add(Heap heap, long addrx, long addry) {
		int typex = Value.getFormat(heap, addrx);
		int typey = Value.getFormat(heap, addry);
		double x;
		if (typex == Value.FORMAT_FLOAT4) {
			x = Float4.get(null, addrx);
		}
		else if (typex == Value.FORMAT_FLOAT8) {
			x = Float8.get(null, addrx);
		}
		else {
			throw new IllegalArgumentException();
		}
		double y;
		if (typey == Value.FORMAT_FLOAT4) {
			y = Float4.get(null, addry);
		}
		else if (typey == Value.FORMAT_FLOAT8) {
			y = Float8.get(null, addry);
		}
		else {
			throw new IllegalArgumentException();
		}
		double z = x + y;
		return allocSet(heap, z);
	}

	public static int getSize(long pValue) {
		return 9;
	}

}
