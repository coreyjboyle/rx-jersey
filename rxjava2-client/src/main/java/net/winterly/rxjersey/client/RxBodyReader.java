package net.winterly.rxjersey.client;

import io.reactivex.*;

/**
 * MessageBodyReader accepting rx types and routing to read entity of generic type instead
 *
 * @see Flowable
 * @see Observable
 * @see Single
 * @see Completable
 * @see Maybe
 */
public class RxBodyReader extends RxGenericBodyReader {

    public RxBodyReader() {
        super(Flowable.class, Observable.class, Single.class, Completable.class, Maybe.class);
    }
}
